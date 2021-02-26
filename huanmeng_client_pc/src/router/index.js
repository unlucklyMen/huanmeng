import Vue from 'vue'
import VueRouter from 'vue-router'
import index from '../components/HelloWorld.vue'
import topicIndex from '../components/topicIndex.vue'
import topicCreat from '../components/topicCreat.vue'
import tagsList from '../components/tagsList.vue'
import notification from '../components/notification.vue'
import setting from '../components/setting.vue'
import userMessage from '../components/userMessage.vue'
import userSetting from '../components/userSetting.vue'
import leaveList from '../components/leaveList.vue'
import leaveCreat from '../components/leaveCreat.vue'
import searchResult from '../components/searchResult.vue'
import leaveIndex from '../components/leaveIndex.vue'
import login from '../components/login.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'index',
    component: index
  },
  {
    path: '/topicIndex',
    name: 'topicIndex',
    component: topicIndex
  },
  {
    path: '/topicCreat',
    name: 'topicCreat',
    component: topicCreat
  },
  {
    path: '/tagsList',
    name: 'tagsList',
    component: tagsList
  },
  {
    path: '/notification',
    name: 'notification',
    component: notification
  },
  {
    path: '/setting',
    name: 'setting',
    component: setting
  },
  {
    path: '/userMessage',
    name: 'userMessage',
    component: userMessage
  },
  {
    path: '/userSetting',
    name: 'userSetting',
    component: userSetting
  },
  {
    path: '/leaveList',
    name: 'leaveList',
    component: leaveList
  },
  {
    path: '/leaveCreat',
    name: 'leaveCreat',
    component: leaveCreat
  },
  {
    path: '/searchResult',
    name: 'searchResult',
    component: searchResult
  },
  {
    path: '/leaveIndex',
    name: 'leaveIndex',
    component: leaveIndex
  },
  {
    path: '/login',
    name: 'login',
    component: login
  }
]

const router = new VueRouter({
  routes
})

export default router
