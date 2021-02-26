<template>
  <v-container>
    <v-app-bar app light elevation="2" >
      <v-btn icon @click="callback">
        取消
      </v-btn>
      <v-spacer></v-spacer>
      <v-btn icon>
        草稿
      </v-btn>
      <v-btn icon>
        <v-icon>mdi-send</v-icon>
      </v-btn>
    </v-app-bar>

    <v-row class="text-center">
      <v-col cols="11" style="margin: 0 auto;">
        <v-text-field label="请输入标题"></v-text-field>
      </v-col>
      <v-col cols="11" style="margin: 0 auto;">
        <v-select :items='tags' label="选择标签"></v-select>
      </v-col>
      <v-col cols="11" style="margin: 0 auto; padding: 0;">
        <v-col cols="12" class="d-flex justify-start" style="color:#777;">
          请上传封面图片
        </v-col>
        <v-col cols="12" class="d-flex flex-row mb-6">
          <v-col class="pa-2" cols="4" ><v-img src="../../static/upload.png" max-height="200" max-width="100%"></v-img></v-col>
        </v-col>
      </v-col>
      <v-col cols="11" style="margin: 0 auto;">
        <wangEditDiv/>
      </v-col>

    </v-row>

  </v-container>
</template>
<style scoped>

</style>
<script>
import wangEditDiv from './comment/WangEditDiv'
export default {
  components: {
    wangEditDiv
  },
  name: 'topicCreat',
  data: () => ({
  }),
  methods: {
    callback () {
      history.back()
    }
  }
}
</script>
