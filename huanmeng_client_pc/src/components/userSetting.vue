<template>
  <v-container>
    <v-app-bar app light >
      <v-btn icon @click="callback">
        <v-icon>mdi-less-than</v-icon>
      </v-btn>
      <div>修改个人信息</div>
      <v-spacer></v-spacer>
    </v-app-bar>
    <v-col cols="12" class="d-flex justify-center align-self-center" style="margin: 10px;">
      <v-avatar color="teal" size="68">
        <img src="https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~300x300.image" alt="昵称">
      </v-avatar>
    </v-col>
    <v-col cols="12">
      <v-text-field dense label="账号" disabled value="13485745875"></v-text-field>
    </v-col>
    <v-col cols="12">
      <v-text-field dense label="昵称" value="昵称"></v-text-field>
    </v-col>
    <v-col cols="12">
      <v-text-field dense label="积分" disabled value="555"></v-text-field>
    </v-col>
    <v-col cols="12">
      <v-text-field dense label="贡献值" disabled value="888"></v-text-field>
    </v-col>
    <v-col cols="12">
      <v-text-field dense label="入驻时间" disabled value="2020/12/30 12:12:12"></v-text-field>
    </v-col>
    <v-col cols="12">
      <v-textarea dense label="个人简介" value="个人简介"></v-textarea>
    </v-col>
    <v-col cols="12">
      <v-btn x-large block color="#9FC3F3">保存修改</v-btn>
    </v-col>
  </v-container>
</template>
<script>
export default {
  components: {
  },
  name: 'userSetting',
  data: () => ({
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
