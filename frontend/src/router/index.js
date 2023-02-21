import { createWebHistory, createRouter } from "vue-router";
//경로가 아닌 라이브러리 이름이 들어가면 라이브러리에서 가지고 오겠다.
import Home from '/src/view/Home.vue'
import List from '/src/view/board/List.vue'

const routes = [
    {
        path: "/",
        component: Home,
    },
    {
        path:"/board/list",
        component: List,
    }

];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;