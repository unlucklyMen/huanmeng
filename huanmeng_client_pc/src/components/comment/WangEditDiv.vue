<template>
  <div>
    <div class="send_menu" ref="editorMune"></div>
    <div class="send_main" ref="editorText" style="text-align:left;height:300px;"></div>
  </div>
</template>
<script>
import E from 'wangeditor'
import OSS from 'ali-oss';
export default {
  name: 'HelloWorld',
  data: () => ({
    editor: null
  }),
  mounted () {
    this.initEdit()
  },
  methods: {
    initEdit () {
      this.editor = new E(this.$refs.editorMune, this.$refs.editorText)
      // 编辑器的事件，每次改变会获取其html内容
      this.editor.config.onchange = (html) => {
        this.editorContent = html
        this.catchData(this.editorContent) // 把这个html通过catchData的方法传入父组件
      }
      this.editor.config.zIndex = 5
      this.editor.config.menus = [
        'bold', // 粗体
        'fontSize', // 字号
        'italic', // 斜体
        'underline', // 下划线
        // 'strikeThrough', // 删除线
        'foreColor', // 文字颜色
        'link', // 插入链接
        'emoticon', // 表情
        'image' // 插入图片
      ]
      // 隐藏“网络图片”tab
      this.editor.config.showLinkImg = false
      // 关闭粘贴内容中的样式
      this.editor.config.pasteFilterStyle = false
      // 忽略粘贴内容中的图片
      this.editor.config.pasteIgnoreImg = true
      // 上传图片时，可自定义filename（controller层需要设置传入的名字时保持一致）
      this.editor.config.uploadFileName = 'myFile'
      // 图片上传接口
      // this.editor.config.uploadImgServer = ctx+'customer/addPhoto'; // 上传图片到服务器
      this.editor.config.customUploadImg = function (resultFiles, insertImgFn) {
        this.uploadPhoto(resultFiles[0], function (res) {
          // 上传图片，返回结果，将图片插入到编辑器中
          insertImgFn(res.url)
        })
      }
      // 设置为debug模式，js会打印错误
      this.editor.config.debug = true
      // 表情面板可以有多个 tab ，因此要配置成一个数组。数组每个元素代表一个 tab 的配置
      this.editor.config.emotions = [{
        // tab 的标题
        title: '默认',
        // type -> 'emoji' / 'image'
        type: 'image',
        // content -> 数组
        content: [{
          alt: '[微笑]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/e3/2018new_weixioa02_org.png'
        },
        {
          alt: '[太开心]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/1e/2018new_taikaixin_org.png'
        },
        {
          alt: '[可爱]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/09/2018new_keai_org.png'
        },
        {
          alt: '[鼓掌]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/6e/2018new_guzhang_org.png'
        },
        {
          alt: '[嘻嘻]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/33/2018new_xixi_org.png'
        },
        {
          alt: '[哈哈]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/8f/2018new_haha_org.png'
        },
        {
          alt: '[笑cry]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/4a/2018new_xiaoku_thumb.png'
        },
        {
          alt: '[挤眼]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/43/2018new_jiyan_org.png'
        },
        {
          alt: '[馋嘴]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/fa/2018new_chanzui_org.png'
        },
        {
          alt: '[黑线]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/a3/2018new_heixian_org.png'
        },
        {
          alt: '[汗]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/28/2018new_han_org.png'
        },
        {
          alt: '[阴险]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/9e/2018new_yinxian_org.png'
        },
        {
          alt: '[爱你]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/f6/2018new_aini_org.png'
        },
        {
          alt: '[抱抱]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/42/2018new_baobao_org.png'
        },
        {
          alt: '[鲜花]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/d4/2018new_xianhua_org.png'
        },
        {
          alt: '[ok]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/45/2018new_ok_org.png'
        },
        {
          alt: '[给你小心心]',
          src: 'http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/ca/qixi2018_xiaoxinxin_thumb.png'
        }]
      }]
      this.editor.create() // 创建富文本实例
    },
    async uploadPhoto (resultFiles, after, fileType) {
      // 具体值需要去阿里云控制台获取
      await this.$ajax.post(this.$serverUrl + '/api/comment/getStsSecret').then(async (data) => {
        const client = new OSS({
          // // region以杭州为例（oss-cn-hangzhou），其他region按实际情况填写。
          region: 'oss-cn-shenzhen',
          // // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
          accessKeyId: data.data.AccessKeyId,
          accessKeySecret: data.data.AccessKeySecret,
          stsToken: data.data.SecurityToken,
          bucket: 'customer-service-for-1010591398262771'
        });
        // resultFiles 是 input 中选中的文件列表
        // insertImgFn 是获取图片 url 后，插入到编辑器的方法
        if (!fileType) {
          if (resultFiles.type.indexOf('image/') !== -1) {
            fileType = resultFiles.type.substring(resultFiles.type.indexOf('/') + 1, resultFiles.type.length)
          } else {
            alert('文件类型错误！需求图片类型')
            return
          }
        }
        await client.put(new Date().getTime().toString() + Math.ceil(Math.random() * 1000) + '.' + fileType, resultFiles, { headers: { 'x-oss-forbid-overwrite': true } })
          .then((res) => {
            after(res);
          }).catch(function (err) {
            alert('图片上传失败，请重新上传')
            console.log(err)
          })
      });
    }
  }
}
</script>
