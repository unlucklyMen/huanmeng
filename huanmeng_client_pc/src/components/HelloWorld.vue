<template>
  <v-container>
    <indexHead :pageName="pageName"/>
    <v-row class="text-center">
      <v-col cols="12" md="10" lg="10" style="margin: 0 auto;" class="d-flex">
        <v-col class=""  cols="12" sm="12" md="9" lg="8">
          <v-btn class="mx-2" style="bottom: 122px;right: 45px;" fixed dark fab color="cyan" to="/topicCreat">
            <v-icon dark>mdi-pencil</v-icon>
          </v-btn>
          <v-col app cols="12">
            <v-tabs show-arrows style="border-bottom: 1px solid #eaeaea;">
              <v-tab>全部</v-tab>
              <v-tab>精华</v-tab>
              <v-tab>最热</v-tab>
              <v-tab>最新</v-tab>
              <v-tab>无人问津</v-tab>
            </v-tabs>
          </v-col>

          <v-col app cols="12">
            <v-col cols="12">
            <v-card  hover to="/topicIndex">
                <v-list-item-content>
                  <v-card-title class="d-inline-block  text-truncate col-12 text-left">朱红悬崖国家纪念碑</v-card-title>
                </v-list-item-content>
                <v-col cols="12" class="d-flex flex-row mb-6">
                  <v-col class="pa-2" cols="4" ><v-img src="https://tse1-mm.cn.bing.net/th?id=OIP.-dvzvaP0phZ2Ar7M8KvuIwHaE7&w=247&h=160&c=8&rs=1&o=5&pid=3.1&rm=2" height="100" width="100"></v-img></v-col>
                  <v-col class="pa-2" cols="4" ><v-img src="https://tse1-mm.cn.bing.net/th?id=OIP.OrzOyJceDftKLZsrCaa8YwAAAA&w=128&h=160&c=8&rs=1&o=5&pid=3.1&rm=2" height="100" width="100"></v-img></v-col>
                  <v-col class="pa-2" cols="4" ><v-img src="https://tse1-mm.cn.bing.net/th?id=OIP.PCN7PIz3QUc9GHzvJ_U1NwHaE7&w=248&h=160&c=8&rs=1&o=5&pid=3.1&rm=2" height="100" width="100"></v-img></v-col>
                </v-col>
                <v-card-actions>
                  <v-breadcrumbs :items="items" divider="-"></v-breadcrumbs>
                </v-card-actions>
              </v-card>
            </v-col>
          </v-col>
        </v-col>
        <v-col cols="4" xl="3" v-if="windowWidth>2">
          <v-card>
            <v-col cols="12" class="d-flex flex-row align-self-center">
              <v-avatar color="teal" size="62">
                <img src="https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~300x300.image" alt="昵称">
              </v-avatar>
              <div class="text-h5 text-center" style="padding: 15px;">昵称</div>
            </v-col>
            <v-divider></v-divider>
            <v-col cols="12" class="d-flex flex-row justify-space-around">
              <div class="text-center">积分:225</div>
              <div class="text-center">未读消息:0</div>
            </v-col>
          </v-card>

          <v-card style="margin-top: 20px;">
            <v-col cols="12" style="background: #eaeaea" class="d-flex flex-row justify-space-around">
              <div class="text-center">积分榜</div>
            </v-col>
            <v-divider></v-divider>
            <v-col cols="12" class="d-flex flex-row justify-space-around">
              <div class="text-center">昵称10058</div>
              <div class="text-center">5452</div>
            </v-col>
            <v-col cols="12" class="d-flex flex-row justify-space-around">
              <div class="text-center">昵称10058</div>
              <div class="text-center">5584</div>
            </v-col>
            <v-col cols="12" class="d-flex flex-row justify-space-around">
              <div class="text-center">昵称10058</div>
              <div class="text-center">5552</div>
            </v-col>
            <v-col cols="12" class="d-flex flex-row justify-space-around">
              <div class="text-center">昵称10058</div>
              <div class="text-center">5452</div>
            </v-col>
            <v-col cols="12" class="d-flex flex-row justify-space-around">
              <div class="text-center">昵称10058</div>
              <div class="text-center">5552</div>
            </v-col>
          </v-card>
        </v-col>
      </v-col>
    </v-row>
    <mobileBottom :choose-num="pageName"/>
  </v-container>
</template>

<script>
import mobileBottom from '@/components/comment/mobileBottom';
import indexHead from '@/components/comment/indexHead';
export default {
  name: 'HelloWorld',
  components: {
    mobileBottom,
    indexHead
  },
  data: () => ({
    pageName: 0,
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
    ],
    downloadUrl: '',
    // 提示下载隐藏显示
    downloadDivShow: true,
    // 窗口宽度
    windowWidth: 0
  }),
  mounted () {
    this.getWindowWidth();
  },
  methods: {
    // 获取窗口宽度
    getWindowWidth () {
      const clientWidth = document.body.clientWidth;
      if (clientWidth < 600) {
        this.windowWidth = 1;
      } else if (clientWidth < 960) {
        this.windowWidth = 2;
      } else if (clientWidth < 1264) {
        this.windowWidth = 3;
      } else if (clientWidth < 1904) {
        this.windowWidth = 4;
      } else {
        this.windowWidth = 5;
      }
    }
  }
}
</script>
<style scoped>
</style>
