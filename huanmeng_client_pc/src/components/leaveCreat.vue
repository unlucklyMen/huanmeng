<template>
  <v-container>
    <v-row class="text-center">
      <v-col cols="11" style="margin: 0 auto;">
        <v-text-field label="请输入标题"></v-text-field>
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
  name: 'leaveCreat',
  data: () => ({
  }),
  methods: {
    callback () {
      history.back()
    }
  }
}
</script>
