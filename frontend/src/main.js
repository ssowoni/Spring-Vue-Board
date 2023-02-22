import { createApp } from 'vue'
import App from './App.vue'
import BootstrapVue3 from 'bootstrap-vue-3'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue-3/dist/bootstrap-vue-3.css'
import router from './router'
import axios from 'axios'

const app = createApp(App)
/*const cors = require('cors');*/

app.config.globalProperties.$axios = axios; //전역변수로 설정 컴포넌트에서 this.$axios 호출할 수 있게 설정
app.config.globalProperties.$serverUrl = '//localhost:8081' //api server
app.use(BootstrapVue3)
/*app.use(cors());*/
app.use(router).mount('#app')



