<template>
  <v-container>
    <indexHead  :pageName="pageName"/>
    <v-col cols="12" class="d-flex justify-space-between">
      <v-btn text disabled>消息列表</v-btn>
      <v-spacer></v-spacer>
      <v-btn text>全部已读</v-btn>
    </v-col>
    <v-divider></v-divider>
    <v-col cols="12">
      <v-card>
        <v-col cols="12" class="d-flex flex-row align-self-center">
          <v-col cols="2">
            <v-avatar color="teal" size="49">
              <img src="https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~300x300.image" alt="昵称">
            </v-avatar>
          </v-col>
          <v-col cols="10">
            <div class="" style="margin-bottom: 10px;">
              <div class="text-h6">aaa</div>
              <div class="text-">2周前评论了你</div>
            </div>
            <v-col cols="12" class="rounded" style="background: #eaeaea">
              aaaaa
            </v-col>
          </v-col>
        </v-col>
      </v-card>
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
  name: 'notification',
  data: () => ({
    pageName: 2
  }),
  methods: {
  }
}
</script>
<style scoped>
</style>
