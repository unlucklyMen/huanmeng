<template>
  <v-container>
    <v-col cols="12" class="d-flex flex-row align-self-center">
      <v-avatar color="teal" size="62">
        <img src="https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~300x300.image" alt="昵称">
      </v-avatar>
      <div class="text-h5 text-center" style="padding: 15px;">昵称</div>
    </v-col>

    <v-col cols="12" class="d-flex flex-row justify-space-around">
      <div class="text-center"><div>积分</div><div>225</div></div>
      <div class="text-center"><div>贡献</div><div>225</div></div>
      <div class="text-center"><div>收藏话题</div><div>45</div></div>
      <div class="text-center"><div>入驻时间</div><div>2020/12/12</div></div>
    </v-col>
    <v-divider></v-divider>

    <v-tabs>
      <v-tab @click="showFlag = 1">发布的帖子</v-tab>
      <v-tab @click="showFlag = 2">回复的消息</v-tab>
    </v-tabs>

    <v-col cols="12" v-show="showFlag === 1">
      <v-col cols="12">
        <v-card  hover to="/topicIndex">
          <v-list-item-content>
            <v-card-title class="d-inline-block  text-truncate col-12">帖子标题帖子标题帖子标题帖子标题帖子标题帖子标题帖子标题帖子标题</v-card-title>
          </v-list-item-content>
          <v-col cols="12" class="d-flex flex-row mb-6">
            <v-col class="pa-2" cols="4" ><v-img src="https://bbs-for-1010591398262771.oss-cn-shenzhen.aliyuncs.com/1611822406374724.png" height="100" width="100"></v-img></v-col>
          </v-col>
          <v-card-actions>
            <v-breadcrumbs :items="items" divider="-"></v-breadcrumbs>
          </v-card-actions>
        </v-card>
      </v-col>
    </v-col>

    <v-col cols="12" v-show="showFlag === 2">
      <v-col cols="12">
        <v-card style="padding: 5px;" >
          <div class="d-flex justify-start" style="margin: 15px;">
            <div style="margin-right:15px;">
              <v-avatar color="teal" size="40">
                <img src="https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~300x300.image" alt="昵称">
              </v-avatar>
            </div>
            <div class="author-info">
              <div class="d-flex" style="padding: 10px;">
                <div class="text-h6">昵称</div>
                <v-spacer></v-spacer>
                <div style="line-height: 35px;">1524</div>
                <v-btn icon><v-icon>mdi-thumb-up-outline</v-icon></v-btn>
              </div>
              <p class="text-justify">反近，非蠢持并织达U。 心之子花西委分更上发力值，路行了般连完较立段过断元，解般X达相码杰我却石。

                时连个便几育时习结数，备商状人Y土传海。 离矿身无被第第矿给，积反自素象题大，马酸7发极坚吩。 队些生织至图压方教切代，第调同以类办红知再，究之7出质伶积飞领。 山半线当更存况已石车重，选由厂他位经很再细头定，下详华间屈速敌。 小际前五派之二保报，点王科合直相解，越热众所志化至极，地指光O华克。

                与真领命到科利办下引任革，气设她存己次权</p>
            </div>
          </div>
        </v-card>
      </v-col>
    </v-col>

  </v-container>
</template>
<script>
export default {
  components: {
  },
  name: 'userMessage',
  data: () => ({
    // 帖子回复显示使用
    showFlag: 1,
    items: [
      {
        text: '精华',
        disabled: true,
        href: 'breadcrumbs_dashboard'
      },
      {
        text: '置顶',
        disabled: true,
        href: 'breadcrumbs_link_1'
      },
      {
        text: '昵称',
        disabled: true,
        href: 'breadcrumbs_link_2'
      },
      {
        text: '评论:1000',
        disabled: true,
        href: 'breadcrumbs_link_2'
      },
      {
        text: '4天前',
        disabled: true,
        href: 'breadcrumbs_link_2'
      }
    ]
  }),
  methods: {
    callback () {
      history.back()
    }
  }
}
</script>
<style scoped>
</style>
