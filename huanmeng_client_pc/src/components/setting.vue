<template>
  <v-container>
    <indexHead :pageName="pageName"/>
    <v-col cols="12">
      <v-card class="mx-auto" max-width="344" outlined >
        <div class="reply_topic">
          <div style="padding-right: 15px;">
            <v-avatar color="teal" size="49">
              <img src="https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~300x300.image" alt="昵称">
            </v-avatar>
          </div>
          <div class="author-info">
            <div class="author-info-name">
              <div class="text-h5">昵称</div>
            </div>
            <br>
            <div class="text-justify">积分：225</div>
            <div class="text-justify">贡献：225</div>
            <div class="text-justify">收藏话题：225</div>
            <div class="text-justify">入驻时间：2020/12/12 12:12:12</div>
          </div>
        </div>
      </v-card>
    </v-col>
    <v-col cols="12">
      <v-list>
        <v-list-item-group color="primary">
          <v-list-item to="/leaveList">
            <v-list-item-icon>
              <v-icon>mdi-clipboard-edit-outline</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>留言</v-list-item-title>
            </v-list-item-content>
          </v-list-item>

          <v-list-item to="/userMessage">
            <v-list-item-icon>
              <v-icon>mdi-account</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>个人主页</v-list-item-title>
            </v-list-item-content>
          </v-list-item>

          <v-list-item to="/userSetting">
            <v-list-item-icon>
              <v-icon>mdi-account-cog</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>个人信息设置</v-list-item-title>
            </v-list-item-content>
          </v-list-item>

          <v-list-item>
            <v-list-item-icon>
              <v-icon>mdi-export</v-icon>
            </v-list-item-icon>
            <v-list-item-content>
              <v-list-item-title>登出</v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-list-item-group>
      </v-list>
    </v-col>
    <mobileBottom :choose-num="pageName"/>

  </v-container>
</template>
<script>
import mobileBottom from '@/components/comment/mobileBottom';
import indexHead from '@/components/comment/indexHead';

export default {
  components: {
    mobileBottom,
    indexHead
  },
  name: 'setting',
  data: () => ({
    pageName: 3,
    tags: ['隐私守护助手', '定制机']
  }),
  methods: {
  }
}
</script>
<style scoped>
.reply_topic{
  display: flex;
  align-items: flex-start;
  margin: 20px;
}

</style>
