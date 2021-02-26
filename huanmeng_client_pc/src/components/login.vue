<template>
  <v-container>
    <v-app-bar app light >
      <v-btn icon @click="callback">
        <v-icon>mdi-less-than</v-icon>
      </v-btn>
      <div>登陆</div>
      <v-spacer></v-spacer>
    </v-app-bar>
    <v-col cols="12" class="justify-center">
      <v-col cols="12" class="d-flex justify-center align-self-center">
        <v-avatar color="teal" size="60">
          <v-img src="../../static/logo.png"></v-img>
        </v-avatar>
        <div class="text-h4" style="padding: 10px;">账号登陆</div>
      </v-col>
      <v-col cols="12">
        <v-text-field
          label="账号"
          outlined
          rounded
        ></v-text-field>
      </v-col>
      <v-col cols="12">
        <v-text-field
          label="密码"
          outlined
          rounded
        ></v-text-field>
      </v-col>
      <v-col cols="12">
        <v-btn x-large block color="#9FC3F3">登陆</v-btn>
      </v-col>
    </v-col>
  </v-container>
</template>
<script>
export default {
  components: {
  },
  name: 'login',
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
