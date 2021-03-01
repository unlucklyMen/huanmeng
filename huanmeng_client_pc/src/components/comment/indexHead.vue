<template>
  <v-app-bar app color="primary" dark >
  <div class="align-center d-none d-sm-flex" @click="gotoPage('/',0)">
    <h2 class="">咸鱼论坛</h2>
  </div>
  <v-spacer class="d-flex d-md-none"></v-spacer>
  <v-col app cols="12" sm="6" md="4" lg="3" xl="2" style="height: 58px;">
    <v-text-field
      label="搜索"
      outlined
      rounded
      dense
      append-icon="mdi-magnify"
      v-model="searchKey"
      @click:append="gotoPage('searchResult?searchKey='+searchKey)"
      @keyup.enter="gotoPage('searchResult?searchKey='+searchKey)"
    ></v-text-field>
  </v-col>
  <v-spacer class="d-none d-md-flex"></v-spacer>
  <v-btn text class="d-none d-md-flex" to="/userSetting">
    <v-icon>mdi-account-cog</v-icon>
    设置
  </v-btn>
  <v-btn text class="d-none d-md-flex" @click="gotoPage('notification',2)" >
    <v-icon>mdi-message</v-icon>
    通知
  </v-btn>
  <v-btn text class="d-none d-md-flex" to="/leaveList">
    <v-icon>mdi-clipboard-edit-outline</v-icon>
    留言
  </v-btn>
  <v-btn text class="d-none d-md-flex">
    <v-icon>mdi-export</v-icon>
    登出
  </v-btn>
  <v-btn text class="d-none d-md-flex" to="/login">
    <v-icon>mdi-account</v-icon>
    登录
  </v-btn>
  <v-btn text to="/userMessage">
    <v-avatar color="#fff" size="30">
      <v-img src="../../../static/logo.png"></v-img>
    </v-avatar>
    昵称
  </v-btn>
  </v-app-bar>
</template>
<script>
export default {
  props: {
    pageName: {
      default: 0
    }
  },
  components: {
  },
  name: 'indexHead',
  data: () => ({
    searchKey: ''
  }),
  mounted () {
  },
  methods: {
    gotoPage (pageName, index) {
      if (index === this.pageName) {
        return;
      }
      this.$router.replace({ path: pageName })
    }
  }
}
</script>
