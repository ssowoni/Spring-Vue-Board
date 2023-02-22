<template>
  <div>
    <b-table striped hover :lsit="list" :fields="fields"></b-table>
  </div>
</template>

<script>

import axios from 'axios'
export default {
  name: "List.vue",
  data() {
    return {
      fields: [
        {
          key: 'bno',
          label: '글번호'
        },
        {
          key: 'title',
          label: '제목'
        },
        {
          key: 'loginID',
          label: '글쓴이'
        },
        {
          key: 'regdate',
          label: '등록일'
        }

      ],

      list: []
    }
  },
  mounted() {
    this.fnGetList();
  },
  methods:{
    fnGetList(){
      axios.get(this.$serverUrl+"/board/list",{

      }).then((res)=>{
        this.list = res.data
      }).catch((err)=>{
        if (err.message.indexOf('Network Error') > -1) {
          alert('네트워크가 원활하지 않습니다.\n잠시 후 다시 시도해주세요.')
        }
      })
    }
  }
}
</script>

<style scoped>

</style>