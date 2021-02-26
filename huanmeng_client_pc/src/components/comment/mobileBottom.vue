<template>
    <v-tabs centered icons-and-text grow class="mobile_foot" v-model="nowNum" v-if="windowWidth<3">
      <v-tab @click="gotoPage('/' ,0)">首页<v-icon>mdi-home</v-icon></v-tab>
      <v-tab @click="gotoPage('/tagsList',1)">标签<v-icon>mdi-tag</v-icon></v-tab>
      <v-tab  @click="gotoPage('/notification',2)">通知<v-icon>mdi-message</v-icon></v-tab>
      <v-tab @click="gotoPage('setting',3)">设置<v-icon>mdi-cog-outline</v-icon></v-tab>
    </v-tabs>
</template>
<script>
export default {
  props: {
    chooseNum: {
      default: 0
    }
  },
  components: {
  },
  name: 'mobileBottom',
  data: () => ({
    // 当前窗口宽度等级
    windowWidth: 1,
    // 当前选中的栏目
    nowNum: 0
  }),
  mounted () {
    this.nowNum = parseInt(this.chooseNum);
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
    },
    gotoPage (pageName, index) {
      if (index === this.nowNum) {
        return;
      }
      this.$router.replace({ path: pageName })
    }
  }
}
</script>
<style scoped>
.mobile_foot{
  background: rgba(230,230,230,0.9);
  width: 100%;
  position: fixed;
  bottom: 0;
  z-index:5;
  left: 0;
  border-top: 1px solid #eaeaea;
}

</style>
