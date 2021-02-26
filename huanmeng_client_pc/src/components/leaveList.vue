 <template>
  <v-container>
    <v-app-bar app light >
      <v-btn icon @click="callback">
        <v-icon>mdi-less-than</v-icon>
      </v-btn>
      <div>留言信息</div>
      <v-spacer></v-spacer>
    </v-app-bar>

    <v-row class="text-center">
      <v-col cols="12" md="10" lg="10" style="margin: 0 auto;" class="d-flex">
        <v-col class=""  cols="12" sm="12" md="9" lg="8">
          <v-btn class="mx-2" style="bottom: 122px;right: 45px;" fixed dark fab color="cyan" to="/leaveCreat">
            <v-icon dark>mdi-pencil</v-icon>
          </v-btn>
          <v-col app cols="12">
            <v-tabs show-arrows style="border-bottom: 1px solid #eaeaea;">
              <v-tab>留言</v-tab>
              <v-tab>已结束留言</v-tab>
            </v-tabs>
          </v-col>

          <v-col app cols="12">
            <v-col cols="12">
              <v-card  hover to="/leaveIndex">
                <v-card-text class="col-12 text-left">基团道世且必际做向，高他花技两快研干圆，治形2命制抖高候。张接今律号后，包型值值细，金Q火特。龙引整出调图世命老程一，由今单至C安两抄。风期千达动条本所更级，性易报决届我赤越。知体其义断无府之，白参常G扯伴。 小分究被市发只始向认，想许面影他原厂为，较文R立杨呆家生。公报性号至进问，上题志声元毛列，行提气快技G，S来个相育。满但队或单天斯元院，南标目大约空心，品也6候就正大。志价二要认更老料件己部，要观史争战名其意为流适，较理辰茅壳告样我态。 属家求队格精积难，百断G豆压。 没装内济精四老设术，任多化霸杨构。众划义决科难开，计消周建计。者与示其格只，是至几最验，计J材近。变非科战此高育公，强社入己成别市东，先分R众九述小。</v-card-text>
              </v-card>
            </v-col>
          </v-col>
        </v-col>
      </v-col>
    </v-row>

  </v-container>
</template>
<script>
export default {
  components: {
  },
  name: 'leaveList',
  data: () => ({
    pageName: 1,
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
    ]
  }),
  mounted () {
    this.getWindowWidth();
  },
  methods: {
    callback () {
      history.back()
    }
  }
}
</script>
<style scoped>
</style>
