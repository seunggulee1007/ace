(function(t){function e(e){for(var r,o,i=e[0],u=e[1],c=e[2],l=0,p=[];l<i.length;l++)o=i[l],Object.prototype.hasOwnProperty.call(s,o)&&s[o]&&p.push(s[o][0]),s[o]=0;for(r in u)Object.prototype.hasOwnProperty.call(u,r)&&(t[r]=u[r]);f&&f(e);while(p.length)p.shift()();return a.push.apply(a,c||[]),n()}function n(){for(var t,e=0;e<a.length;e++){for(var n=a[e],r=!0,o=1;o<n.length;o++){var u=n[o];0!==s[u]&&(r=!1)}r&&(a.splice(e--,1),t=i(i.s=n[0]))}return t}var r={},s={main:0},a=[];function o(t){return i.p+"js/"+({}[t]||t)+"."+{"chunk-2d0aed93":"1b01da89","chunk-2d0ba139":"06ab951f","chunk-2d0c5aba":"debfa9a8","chunk-2d0c94c1":"3e39a6e2","chunk-2d21d8a4":"4e93957a","chunk-2d2389d6":"fd1aed05","chunk-7df0d327":"5160a2f6"}[t]+".js"}function i(e){if(r[e])return r[e].exports;var n=r[e]={i:e,l:!1,exports:{}};return t[e].call(n.exports,n,n.exports,i),n.l=!0,n.exports}i.e=function(t){var e=[],n=s[t];if(0!==n)if(n)e.push(n[2]);else{var r=new Promise((function(e,r){n=s[t]=[e,r]}));e.push(n[2]=r);var a,u=document.createElement("script");u.charset="utf-8",u.timeout=120,i.nc&&u.setAttribute("nonce",i.nc),u.src=o(t);var c=new Error;a=function(e){u.onerror=u.onload=null,clearTimeout(l);var n=s[t];if(0!==n){if(n){var r=e&&("load"===e.type?"missing":e.type),a=e&&e.target&&e.target.src;c.message="Loading chunk "+t+" failed.\n("+r+": "+a+")",c.name="ChunkLoadError",c.type=r,c.request=a,n[1](c)}s[t]=void 0}};var l=setTimeout((function(){a({type:"timeout",target:u})}),12e4);u.onerror=u.onload=a,document.head.appendChild(u)}return Promise.all(e)},i.m=t,i.c=r,i.d=function(t,e,n){i.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:n})},i.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},i.t=function(t,e){if(1&e&&(t=i(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var n=Object.create(null);if(i.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var r in t)i.d(n,r,function(e){return t[e]}.bind(null,r));return n},i.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return i.d(e,"a",e),e},i.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},i.p="/",i.oe=function(t){throw console.error(t),t};var u=window["webpackJsonp"]=window["webpackJsonp"]||[],c=u.push.bind(u);u.push=e,u=u.slice();for(var l=0;l<u.length;l++)e(u[l]);var f=c;a.push([0,"chunk-vendors"]),n()})({0:function(t,e,n){n("db4d"),t.exports=n("56d7")},"034f":function(t,e,n){"use strict";var r=n("85ec"),s=n.n(r);s.a},"56d7":function(t,e,n){"use strict";n.r(e);n("96cf");var r=n("1da1"),s=n("2b0e"),a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"wrap",attrs:{id:"app"}},[n("app-header"),n("router-view")],1)},o=[],i=function(){var t=this,e=t.$createElement,n=t._self._c||e;return t.isUserLogin?n("header",{staticClass:"header admin-header"},[t._m(0),n("button",{staticClass:"button__logout",on:{click:t.logoutUser}},[t._v("로그아웃")])]):t._e()},u=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("h1",{staticClass:"logo logo-vertical"},[n("p",{staticClass:"mark"},[n("span",[t._v("A")])]),n("p",[n("span",[n("span",{staticClass:"color"},[t._v("ACE")]),t._v(" Business Portal")]),n("span",[t._v("Agile Centric Efficiency")])])]),n("h2",{staticClass:"page-title"},[t._v("관리자센터")]),n("nav",{staticClass:"gnb"},[n("ul",{staticClass:"lst-gnb"},[n("li",{staticClass:"lst-gnb__title"},[n("p",[t._v("부서/사용자")])]),n("li",{staticClass:"lst-gnb__item on"},[n("a",{staticClass:"lst-gnb__link",attrs:{href:"/admin/deptRegistration"}},[t._v("부서 등록")])]),n("li",{staticClass:"lst-gnb__item"},[n("a",{staticClass:"lst-gnb__link",attrs:{href:"/admin/userRegistration"}},[t._v("사용자 등록")])]),n("li",{staticClass:"lst-gnb__title"},[n("p",[t._v("권한")])]),n("li",{staticClass:"lst-gnb__item"},[n("a",{staticClass:"lst-gnb__link",attrs:{href:"/admin/permissionsGroup"}},[t._v("권한그룹 등록")])]),n("li",{staticClass:"lst-gnb__item"},[n("a",{staticClass:"lst-gnb__link",attrs:{href:"/admin/permissions"}},[t._v("권한 등록")])]),n("li",{staticClass:"lst-gnb__title"},[n("p",[t._v("휴일")])]),n("li",{staticClass:"lst-gnb__item"},[n("a",{staticClass:"lst-gnb__link",attrs:{href:"/admin/holiday"}},[t._v("휴일 등록")])])])])])}];n("99af"),n("4d63"),n("ac1f"),n("25f0"),n("5319");function c(t,e){document.cookie="".concat(t,"=").concat(e)}function l(t){var e="(?:(?:^|.*;\\s*){name}\\s*=\\s*([^;]*).*$)|^.*$";return e=new RegExp(e.replace(/{name}/gi,t)),document.cookie.replace(e,"$1")}function f(t){document.cookie="".concat(t,"=; expires=Thu, 01 Jan 1970 00:00:01 GMT;")}var p={computed:{isUserLogin:function(){return this.$store.getters.isLogin}},methods:{logoutUser:function(){var t=this;return Object(r["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,t.sConfirm("로그아웃 하시겠습니까?");case 2:if(!e.sent){e.next=8;break}t.$store.commit("clearLoginInfo"),f("ace_user_nm"),f("ace_auth_token"),f("ace_user_id"),t.$router.push("/login");case 8:case"end":return e.stop()}}),e)})))()}}},d=p,h=n("2877"),m=Object(h["a"])(d,i,u,!1,null,null,null),g=m.exports,_={components:{AppHeader:g}},b=_,v=(n("034f"),Object(h["a"])(b,a,o,!1,null,null,null)),k=v.exports,w=(n("d3b7"),n("8c4f")),C=n("2f62"),x=n("bc3a"),y=n.n(x);function S(t){return t.interceptors.request.use((function(t){return t.headers["X-AUTH-TOKEN"]=R.state.token,t}),(function(t){return Promise.reject(t)})),t.interceptors.response.use((function(t){return t}),(function(t){return Promise.reject(t)})),t}function T(){var t=y.a.create({baseURL:"".concat("http://www.tpsg.co.kr:7979","/api")});return S(t)}var j=T();function O(t,e,n,r){return R.state.spinnerStatus=!0,j({url:t,method:e,params:n,config:r}).then((function(t){var e=t.data;return R.state.spinnerStatus=!1,e})).catch((function(t){R.state.spinnerStatus=!1;var e={result:-1};return t.response?(console.log("error.response"),e=t.response.data,e.status=t.response.status):t.status?401==t.response.status?(f("ace_auth_token"),M.push("/")):(console.log("else"),e.data.resultMsg=t.message):(console.log("status"),e.resultMsg="네트워크 연결을 확인해 주세요"),e}))}function P(t){return O("/signIn","post",t)}var $={LOGIN:function(t,e){var n=this;return Object(r["a"])(regeneratorRuntime.mark((function r(){var s,a,o;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return s=t.commit,r.next=3,P(e);case 3:return a=r.sent,console.log(a),0==a.result?(o=a.data,s("setLoginInfo",o),c("ace_auth_token",o.authToken),c("ace_user_nm",o.user.userNm),c("ace_user_id",o.user.userId)):n._vm.$swal({title:"알림",text:a.resultMsg,icon:"error"}),r.abrupt("return",a);case 7:case"end":return r.stop()}}),r)})))()}},I={setLoginInfo:function(t,e){t.userId=e.user.userId,t.token=e.authToken,t.userNm=e.user.userNm},clearLoginInfo:function(t){t.userId="",t.token="",t.userNm=""},setSpinnerStatus:function(t){t.spinnerStatus=!t.spinnerStatus},setSectionPush:function(t){t.sectionPush=!t.sectionPush}},L={isLogin:function(t){return""!==t.token},getToken:function(t){return t.token},getUserId:function(t){return t.userId},getSectionPush:function(t){return t.sectionPush},getSpinnerStatus:function(t){return t.spinnerStatus}};s["a"].use(C["a"]);var R=new C["a"].Store({state:{userId:l("ace_user_id")||"",userNm:l("ace_user_nm")||"",token:l("ace_auth_token")||"",spinnerStatus:!1,sectionPush:!1},getters:L,mutations:I,actions:$});s["a"].use(w["a"]);var E=[{path:"/",redirect:"/admin/deptRegistration"},{path:"/login",name:"로그인 페이지",meta:{auth:!0},component:function(){return n.e("chunk-7df0d327").then(n.bind(null,"a55b"))}},{path:"/admin/deptRegistration",component:function(){return n.e("chunk-2d2389d6").then(n.bind(null,"ffaa"))}},{path:"/admin/holiday",component:function(){return n.e("chunk-2d0c5aba").then(n.bind(null,"3fa2"))}},{path:"/admin/permission",component:function(){return n.e("chunk-2d0c94c1").then(n.bind(null,"5918"))}},{path:"/admin/permissionGroup",component:function(){return n.e("chunk-2d0ba139").then(n.bind(null,"3655"))}},{path:"/admin/userRegistration",component:function(){return n.e("chunk-2d21d8a4").then(n.bind(null,"d277"))}},{path:"*",component:function(){return n.e("chunk-2d0aed93").then(n.bind(null,"0c8b"))}}],B=new w["a"]({mode:"history",base:"/",routes:E});B.beforeEach((function(t,e,n){if(!t.meta.auth&&!R.getters.isLogin)return console.log("인증이 필요합니다."),void n("/login");"/login"==t.path&&R.getters.getToken&&n("/"),n()}));var M=B,A=n("5886"),N={confirmButtonColor:"#41b882",cancelButtonColor:"#ff7674"};s["a"].use(A["default"],N),s["a"].mixin({methods:{sAlert:function(t,e,n){e=e||"알림",t=t||"",n=n||"확인",this.$swal({title:e,text:t,confirmButtonText:n,icon:"info"})},sWarnning:function(t,e,n){e=e||"경고",t=t||"",n=n||"확인",this.$swal({title:e,text:t,confirmButtonText:n,icon:"warning"})},sConfirm:function(t,e){var n=this;return Object(r["a"])(regeneratorRuntime.mark((function r(){var s,a;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:for(a in s={},e)s.append(a,e[a]);return t&&(s.title=t),s.showCancelButton=!0,s.confirmButtonText||(s.confirmButtonText="예"),s.cancelButtonText||(s.cancelButtonText="아니오"),r.next=8,n.$swal(s).then((function(t){return t.isConfirmed}));case 8:return r.abrupt("return",r.sent);case 9:case"end":return r.stop()}}),r)})))()}}}),s["a"].config.productionTip=!1,new s["a"]({router:M,store:R,render:function(t){return t(k)}}).$mount("#app")},"85ec":function(t,e,n){}});
//# sourceMappingURL=main.80047e36.js.map