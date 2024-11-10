const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootr1tjf/",
            name: "springbootr1tjf",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootr1tjf/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园新闻网站"
        } 
    }
}
export default base
