(function(e){function t(t){for(var s,a,o=t[0],u=t[1],c=t[2],l=0,m=[];l<o.length;l++)a=o[l],Object.prototype.hasOwnProperty.call(i,a)&&i[a]&&m.push(i[a][0]),i[a]=0;for(s in u)Object.prototype.hasOwnProperty.call(u,s)&&(e[s]=u[s]);d&&d(t);while(m.length)m.shift()();return r.push.apply(r,c||[]),n()}function n(){for(var e,t=0;t<r.length;t++){for(var n=r[t],s=!0,a=1;a<n.length;a++){var u=n[a];0!==i[u]&&(s=!1)}s&&(r.splice(t--,1),e=o(o.s=n[0]))}return e}var s={},i={main:0},r=[];function a(e){return o.p+"js/"+({}[e]||e)+"."+{"chunk-2d0aed93":"738e3d7b","chunk-2d0b2c9d":"1eaba348","chunk-2d0ba139":"72c41857","chunk-2d0c1537":"17e76dae","chunk-2d0c5aba":"9f529501","chunk-2d0c8405":"62bf0db5","chunk-2d0c94c1":"3cc51085","chunk-2d0db2c3":"e8dcf485","chunk-2d0dd86a":"f645965c","chunk-2d0e23ce":"a1a38b14","chunk-2d0e5b16":"89a37aa6","chunk-2d0f0e3e":"5894d9d8","chunk-2d2077e3":"9b86b9cb","chunk-2d2086b7":"86f74f94","chunk-2d210f45":"ae46b967","chunk-2d212bd3":"cc8584cd","chunk-69a83782":"48b90a1c","chunk-d916b39e":"b5c33aaf"}[e]+".js"}function o(t){if(s[t])return s[t].exports;var n=s[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,o),n.l=!0,n.exports}o.e=function(e){var t=[],n=i[e];if(0!==n)if(n)t.push(n[2]);else{var s=new Promise((function(t,s){n=i[e]=[t,s]}));t.push(n[2]=s);var r,u=document.createElement("script");u.charset="utf-8",u.timeout=120,o.nc&&u.setAttribute("nonce",o.nc),u.src=a(e);var c=new Error;r=function(t){u.onerror=u.onload=null,clearTimeout(l);var n=i[e];if(0!==n){if(n){var s=t&&("load"===t.type?"missing":t.type),r=t&&t.target&&t.target.src;c.message="Loading chunk "+e+" failed.\n("+s+": "+r+")",c.name="ChunkLoadError",c.type=s,c.request=r,n[1](c)}i[e]=void 0}};var l=setTimeout((function(){r({type:"timeout",target:u})}),12e4);u.onerror=u.onload=r,document.head.appendChild(u)}return Promise.all(t)},o.m=e,o.c=s,o.d=function(e,t,n){o.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},o.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},o.t=function(e,t){if(1&t&&(e=o(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(o.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var s in e)o.d(n,s,function(t){return e[t]}.bind(null,s));return n},o.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return o.d(t,"a",t),t},o.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},o.p="/",o.oe=function(e){throw console.error(e),e};var u=window["webpackJsonp"]=window["webpackJsonp"]||[],c=u.push.bind(u);u.push=t,u=u.slice();for(var l=0;l<u.length;l++)t(u[l]);var d=c;r.push([0,"chunk-vendors"]),n()})({0:function(e,t,n){n("db4d"),e.exports=n("56d7")},"034f":function(e,t,n){"use strict";var s=n("85ec"),i=n.n(s);i.a},"07a4":function(e,t,n){"use strict";var s=n("2b0e"),i=n("2f62");n("99af"),n("4d63"),n("ac1f"),n("25f0"),n("5319");function r(e){var t="(?:(?:^|.*;\\s*){name}\\s*=\\s*([^;]*).*$)|^.*$";return t=new RegExp(t.replace(/{name}/gi,e)),document.cookie.replace(t,"$1")}n("96cf");var a=n("1da1"),o=n("4ec3");function u(e){return Object(o["a"])("/signIn","post",e)}var c={LOGIN:function(e,t){var n=this;return Object(a["a"])(regeneratorRuntime.mark((function s(){var i,r,a;return regeneratorRuntime.wrap((function(s){while(1)switch(s.prev=s.next){case 0:return i=e.commit,s.next=3,u(t);case 3:return r=s.sent,0==r.result&&(a=r.data,i("setLoginInfo",a),i("setUserInfo",a),n._vm.$cookie.set("ace_auth_token",a.authToken),n._vm.$cookie.set("ace_user_id",a.user.userId)),s.abrupt("return",r);case 6:case"end":return s.stop()}}),s)})))()}},l={setLoginInfo:function(e,t){console.log(t),e.userId=t.user.userId,e.token=t.authToken},clearLoginInfo:function(e){this._vm.$cookie.delete("ace_auth_token"),this._vm.$cookie.delete("ace_user_id"),e.userId="",e.token=""}},d={isLogin:function(e){return""!==e.token},getToken:function(e){return e.token},getUserId:function(e){return e.userId}},m={state:function(){return{userId:r("ace_user_id")||"",token:r("ace_auth_token")||""}},getters:d,mutations:l,actions:c},f=m,p={},h={setRouterMenuList:function(e,t){e.routerMenuList=t},setMenuList:function(e,t){e.menuList=t}},_={routerMenuList:function(e){return e.routerMenuList},menuList:function(e){return e.menuList}},v={state:function(){return{routerMenuList:[],menuList:[]}},getters:_,mutations:h,actions:p},g=v,b={},k={setUserInfo:function(e,t){console.log("유저 인포 저장 ?"),e.userNm=t.user.userNm,e.adminYn=t.user.adminYn},clearUserInfo:function(e){e.userNm="",e.adminYn="N",e.adminView=!1},setAdminView:function(e){console.log("호출됨 !"),e.adminView=!e.adminView}},w={getUserNm:function(e){return e.userNm},isAdmin:function(e){return console.log(e),"Y"==e.adminYn},adminView:function(e){return e.adminView}},C={state:function(){return{userNm:"",adminYn:"",adminView:!1}},getters:w,mutations:k,actions:b},$={},y={setUserModal:function(e){e.userModal=!e.userModal},setDeptModal:function(e){e.deptModal=!e.deptModal},closeUserModal:function(e){e.userModal=!1},closeDeptModal:function(e){e.deptModal=!1}},L={showUserModal:function(e){return e.userModal},showDeptModal:function(e){return e.deptModal}},O={state:function(){return{userModal:!1,deptModal:!1}},getters:L,mutations:y,actions:$},x=O,M=n("0e44");s["default"].use(i["a"]);t["a"]=new i["a"].Store({modules:{Auth:f,Menu:g,User:C,Modal:x},plugins:[Object(M["a"])({paths:["User","Menu"]})]})},"4ec3":function(e,t,n){"use strict";n.d(t,"a",(function(){return l}));var s=n("bc3a"),i=n.n(s),r=(n("d3b7"),n("07a4"));function a(e){return e.interceptors.request.use((function(e){return e.headers["X-AUTH-TOKEN"]=r["a"].getters.getToken,e}),(function(e){return Promise.reject(e)})),e.interceptors.response.use((function(e){return e}),(function(e){return Promise.reject(e)})),e}var o=n("9883");function u(){var e=i.a.create({baseURL:"".concat("http://www.tpsg.co.kr:7979","/api")});return a(e)}var c=u();function l(e,t,n,s){return r["a"].state.spinnerStatus=!0,c({url:e,method:t,params:n,config:s}).then((function(e){return r["a"].state.spinnerStatus=!1,e.headers.ACCESS_TOKEN&&(r["a"].commit("setToken",e.headers.ACCESS_TOKEN),r["a"]._vm.$cookie.set("ace_auth_token",e.headers.ACCESS_TOKEN)),e.data})).catch((function(e){r["a"].state.spinnerStatus=!1;var t={result:-1};return console.log(e.response),e.response?(t=e.response.data,t.status=e.response.status,401==e.response.status&&(r["a"].commit("clearLoginInfo"),r["a"].commit("clearUserInfo"),r["a"]._vm.$cookie.delete("ace_auth_token"),r["a"]._vm.$cookie.delete("ace_user_id"),r["a"]._vm.$alert(t.resultMsg,"경고",{confirmButtonText:"확인",callback:function(e){e&&o["a"].push("/login")}}))):e.status?t.data.resultMsg=e.message:t.resultMsg="네트워크 연결을 확인해 주세요",r["a"]._vm.$message({type:"warnning",message:t.resultMsg}),t}))}},"56d7":function(e,t,n){"use strict";n.r(t);n("96cf");var s=n("1da1"),i=n("2b0e"),r=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"wrap",attrs:{id:"app"}},[!this.$store.getters.adminView&&e.isUserLogin?n("app-header"):e._e(),!this.$store.getters.adminView&&e.isUserLogin?n("app-navi"):e._e(),this.$store.getters.adminView&&e.isUserLogin?n("admin-header"):e._e(),n("transition",{attrs:{name:"fade"}},[n("router-view")],1)],1)},a=[],o=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("header",{staticClass:"header user-header"},[n("div",{staticClass:"header-top"},[e._m(0),n("ul",{staticClass:"util-menu"},[e._m(1),n("li",{staticClass:"util-menu__link"},[n("div",{staticClass:"user-name"},[e._m(2),n("p",[e._v(e._s(this.$store.getters.getUserNm))])]),n("span",{staticClass:"icon icon-arrow"}),e._m(3),this.$store.getters.isAdmin?n("button",{staticClass:"button",on:{click:e.goAdminView}},[e._v(" 관리자 페이지 ")]):e._e()])])]),n("nav",{staticClass:"gnb"},[n("ul",{staticClass:"lst-gnb"},e._l(e.menuList,(function(t,s){return n("li",{key:s,staticClass:"lst-gnb__item"},[n("span",{staticClass:"icon icon-gnb2"}),n("span",[e._v(e._s(t.menuNm))]),t.children&&t.children.length>0?n("div",{staticClass:"gnb-sub"},e._l(t.children,(function(s){return n("ul",{key:s.menuId,staticClass:"lst-gnb-sub"},[n("li",{staticClass:"lst-sub__title"},[n("p",[e._v(e._s(t.menuNm))])]),e._l(s.children,(function(t){return n("li",{key:t.menuId,staticClass:"lst-sub__item"},[t.pageUrl?n("router-link",{staticClass:"lst-sub__link",attrs:{to:t.pageUrl}},[n("span",[e._v(e._s(t.menuNm))])]):n("span",[e._v(e._s(t.menuNm))])],1)}))],2)})),0):e._e()])})),0)])])},u=[function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("a",{attrs:{href:"/"}},[n("h1",{staticClass:"logo logo-line"},[n("p",{staticClass:"mark"},[n("span",[e._v("A")])]),n("p",[n("span",[n("span",{staticClass:"color"},[e._v("ACE")]),e._v(" Business Portal")]),n("span",[e._v("Agile Centric Efficiency")])])])])},function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("li",{staticClass:"util-menu__link"},[n("button",{staticClass:"button__alert",attrs:{type:"button"}},[n("span",{staticClass:"icon icon-alert"},[n("span",{staticClass:"blind"},[e._v("알림")])])])])},function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"img-user"},[n("img",{attrs:{src:"/images/sample1.jpeg",alt:""}})])},function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("ul",{staticClass:"account-menu"},[n("li",[n("a",{attrs:{href:"/mypage.html"}},[e._v("마이페이지")])]),n("li",[n("button",{staticClass:"button__logout"},[e._v("로그아웃")])])])}],c=(n("99af"),n("baa5"),n("d3b7"),n("b85c")),l=n("4ec3");function d(){return Object(l["a"])("/menu/menuList","get")}var m={created:function(){this.selectMenuList()},data:function(){return{menuList:[]}},methods:{logoutUser:function(){var e=this;this.sConfirm("로그아웃 하시겠습니까?",(function(){e.$store.commit("clearLoginInfo"),e.$store.commit("clearUserInfo"),e.$router.push("/login")}))},goAdminView:function(){this.$store.commit("setAdminView"),this.$router.push("/admin/deptRegistration")},selectMenuList:function(){var e=this;return Object(s["a"])(regeneratorRuntime.mark((function t(){var s,i,r,a,o,u;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,d();case 2:if(s=t.sent,0!=s.result){t.next=30;break}e.menuList=s.data.menuList,e.routerMenuList=s.data.routerMenuList,i=[],r=Object(c["a"])(s.data.routerMenuList),t.prev=8,o=function(){var e=a.value;if(!e.pageUrl)return"continue";i.push({path:e.pageUrl,name:e.menuNm,component:function(){return n("627e")("./views".concat(e.pageUrl.substring(0,e.pageUrl.lastIndexOf("/")+1)).concat(e.component,".vue"))}})},r.s();case 11:if((a=r.n()).done){t.next=17;break}if(u=o(),"continue"!==u){t.next=15;break}return t.abrupt("continue",15);case 15:t.next=11;break;case 17:t.next=22;break;case 19:t.prev=19,t.t0=t["catch"](8),r.e(t.t0);case 22:return t.prev=22,r.f(),t.finish(22);case 25:i.push({path:"/",redirect:i[0].path}),i.push({path:"*",component:function(){return n.e("chunk-2d0aed93").then(n.bind(null,"0c8b"))}}),e.$store.commit("setRouterMenuList",s.data),e.$router.addRoutes(i),e.$store.commit("setMenuList",e.menuList);case 30:case"end":return t.stop()}}),t,null,[[8,19,22,25]])})))()}}},f=m,p=n("2877"),h=Object(p["a"])(f,o,u,!1,null,null,null),_=h.exports,v=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("header",{staticClass:"header admin-header"},[n("div",[e._m(0),n("h2",{staticClass:"page__title"},[e._v("관리자센터")]),n("nav",{staticClass:"admin-gnb"},[n("ul",{staticClass:"lst-gnb"},[e._m(1),n("li",{staticClass:"lst-gnb__item"},[n("router-link",{staticClass:"lst-gnb__link",attrs:{to:"/admin/deptRegistration"}},[e._v("부서 등록")])],1),n("li",{staticClass:"lst-gnb__item"},[n("router-link",{staticClass:"lst-gnb__link",attrs:{to:"/admin/userRegistration"}},[e._v("사용자 등록")])],1),e._m(2),n("li",{staticClass:"lst-gnb__item"},[n("router-link",{staticClass:"lst-gnb__link",attrs:{to:"/admin/permissionsGroup"}},[e._v("권한그룹 등록")])],1),n("li",{staticClass:"lst-gnb__item"},[n("router-link",{staticClass:"lst-gnb__link",attrs:{to:"/admin/permissions"}},[e._v("권한 등록")])],1),e._m(3),n("li",{staticClass:"lst-gnb__item"},[n("router-link",{staticClass:"lst-gnb__link",attrs:{to:"/admin/holiday"}},[e._v("휴일 등록")])],1)])])]),n("div",{staticClass:"buttons"},[n("button",{staticClass:"button__main",on:{click:e.goUserView}},[n("span",{staticClass:"icon icon-user"}),e._v(" 사용자 화면 ")]),n("button",{staticClass:"button__logout",on:{click:e.logoutUser}},[n("span",{staticClass:"icon icon-logout"}),e._v(" 로그아웃 ")])])])},g=[function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("h1",{staticClass:"logo logo-vertical"},[n("p",{staticClass:"mark"},[n("span",[e._v("A")])]),n("p",[n("span",[n("span",{staticClass:"color"},[e._v("ACE")]),e._v(" Business Portal")]),n("span",[e._v("Agile Centric Efficiency")])])])},function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("li",{staticClass:"lst-gnb__title"},[n("p",[e._v("부서/사용자")])])},function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("li",{staticClass:"lst-gnb__title"},[n("p",[e._v("권한")])])},function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("li",{staticClass:"lst-gnb__title"},[n("p",[e._v("휴일")])])}],b={methods:{logoutUser:function(){var e=this;this.sConfirm("로그아웃 하시겠습니까?",(function(){e.$store.commit("clearLoginInfo"),e.$store.commit("clearUserInfo"),e.$router.push("/login")}))},goUserView:function(){this.$store.commit("setAdminView"),this.$router.push("/flexibleWork/agile/agileWorking")}}},k=b,w=Object(p["a"])(k,v,g,!1,null,null,null),C=w.exports,$=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"lnb"},e._l(e.menuList,(function(e,t){return n("ul",{key:t,staticClass:"lst-lnb"},[n("tree-view",{attrs:{item:e}})],1)})),0)},y=[],L=n("5530"),O=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("li",{staticClass:"lst-lnb__item",class:{show:e.isOpen}},[e.item.pageUrl?n("div",[n("router-link",{staticClass:"lst-lnb__link",attrs:{to:e.item.pageUrl}},[e._v(" "+e._s(e.item.menuNm)+" ")]),e.isFolder&&!e.isOpen?n("span",[e._v("+")]):e._e(),e.isFolder&&e.isOpen?n("span",[e._v("-")]):e._e()],1):n("div",{on:{click:e.toggle}},[e._v(" "+e._s(e.item.menuNm)+" "),e.isFolder&&!e.isOpen?n("span",[e._v("+")]):e._e(),e.isFolder&&e.isOpen?n("span",[e._v("-")]):e._e()]),n("ul",e._l(e.item.children,(function(e,t){return n("tree-item",{key:t,attrs:{item:e}})})),1)])},x=[],M={name:"tree-item",props:{item:Object},created:function(){this.isOpen=this.item.isOpen},data:function(){return{isOpen:!1}},computed:{isFolder:function(){return this.item.children&&this.item.children.length}},methods:{toggle:function(){this.isOpen=!this.isOpen}}},U=M,j=Object(p["a"])(U,O,x,!1,null,null,null),E=j.exports,A=n("2f62"),I={computed:Object(L["a"])(Object(L["a"])({},Object(A["c"])(["menuList"])),{},{isUserLogin:function(){return this.$store.getters.isLogin}}),components:{TreeView:E}},N=I,T=Object(p["a"])(N,$,y,!1,null,null,null),P=T.exports,R={computed:{isUserLogin:function(){return this.$store.getters.isLogin}},components:{AppHeader:_,AdminHeader:C,AppNavi:P}},W=R,V=(n("034f"),Object(p["a"])(W,r,a,!1,null,null,null)),S=V.exports,F=n("9883"),B=n("07a4"),D=n("5c96"),Y=n.n(D),G=(n("0fae"),n("fcff")),H=n.n(G),K=n("00e7"),q=n.n(K);i["default"].use(q.a),i["default"].use(Y.a,{locale:H.a}),i["default"].mixin({methods:{sAlert:function(e,t,n,s){t=t||"알림",e=e||"",n=n||"확인",this.$alert(e,t,{confirmButtonText:n,callback:function(e){e&&"function"==typeof s&&s()}})},sConfirm:function(e,t){var n=this;return Object(s["a"])(regeneratorRuntime.mark((function s(){return regeneratorRuntime.wrap((function(s){while(1)switch(s.prev=s.next){case 0:n.$confirm(e,"확인",{confirmButtonText:"예",cancelButtonText:"아니오",type:"warning"}).then((function(){t()})).catch((function(){n.$message({type:"info",message:"Delete canceled"})}));case 1:case"end":return s.stop()}}),s)})))()}}}),i["default"].config.productionTip=!1,new i["default"]({router:F["a"],store:B["a"],render:function(e){return e(S)}}).$mount("#app")},"627e":function(e,t,n){var s={"./views/Login.vue":["a55b","chunk-2d2086b7"],"./views/NotFoundPage.vue":["0c8b","chunk-2d0aed93"],"./views/admin/DeptRegistration.vue":["ffaa","chunk-69a83782"],"./views/admin/Holiday.vue":["3fa2","chunk-2d0c5aba"],"./views/admin/Permission.vue":["5918","chunk-2d0c94c1"],"./views/admin/PermissionsGroup.vue":["3655","chunk-2d0ba139"],"./views/admin/UserRegistration.vue":["d277","chunk-d916b39e"],"./views/flexibleWork/agile/AgileWorking.vue":["9dfc","chunk-2d0f0e3e"],"./views/flexibleWork/agile/AgileWorkingList.vue":["8282","chunk-2d0dd86a"],"./views/flexibleWork/approval/ApprovalChange.vue":["a185","chunk-2d2077e3"],"./views/flexibleWork/approval/ApprovalStatus.vue":["9625","chunk-2d0e5b16"],"./views/flexibleWork/punctuality/Attendance.vue":["b9a9","chunk-2d210f45"],"./views/flexibleWork/punctuality/BusinessTrip.vue":["6f74","chunk-2d0db2c3"],"./views/flexibleWork/punctuality/FieldWork.vue":["7e9c","chunk-2d0e23ce"],"./views/flexibleWork/punctuality/Leave.vue":["4621","chunk-2d0c1537"],"./views/flexibleWork/punctuality/Overtime.vue":["2636","chunk-2d0b2c9d"],"./views/flexibleWork/punctuality/WorkingPattern.vue":["aa63","chunk-2d212bd3"],"./views/flexibleWork/punctuality/WorkingTime.vue":["53a2","chunk-2d0c8405"]};function i(e){if(!n.o(s,e))return Promise.resolve().then((function(){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}));var t=s[e],i=t[0];return n.e(t[1]).then((function(){return n(i)}))}i.keys=function(){return Object.keys(s)},i.id="627e",e.exports=i},"85ec":function(e,t,n){},9883:function(e,t,n){"use strict";n("d3b7");var s=n("2b0e"),i=n("8c4f"),r=n("07a4");s["default"].use(i["a"]);var a=[{path:"/login",name:"로그인 페이지",meta:{auth:!0},component:function(){return n.e("chunk-2d2086b7").then(n.bind(null,"a55b"))}},{path:"/admin/deptRegistration",meta:{admin:!0},component:function(){return n.e("chunk-69a83782").then(n.bind(null,"ffaa"))}},{path:"/admin/holiday",meta:{admin:!0},component:function(){return n.e("chunk-2d0c5aba").then(n.bind(null,"3fa2"))}},{path:"/admin/permissions",meta:{admin:!0},component:function(){return n.e("chunk-2d0c94c1").then(n.bind(null,"5918"))}},{path:"/admin/permissionsGroup",meta:{admin:!0},component:function(){return n.e("chunk-2d0ba139").then(n.bind(null,"3655"))}},{path:"/admin/userRegistration",meta:{admin:!0},component:function(){return n.e("chunk-d916b39e").then(n.bind(null,"d277"))}}],o=new i["a"]({mode:"history",base:"/",routes:a});o.beforeEach((function(e,t,n){return e.meta.admin&&!r["a"].getters.isAdmin?(r["a"]._vm.$message({type:"info",message:"해당 페이지에 접근 권한이 없습니다."}),void n(t.path)):e.meta.auth||r["a"].getters.isLogin?("/login"==e.path&&r["a"].getters.getToken&&n("/"),void n()):(r["a"]._vm.$message({type:"info",message:"인증이 필요합니다"}),void n("/login"))})),t["a"]=o}});
//# sourceMappingURL=main.1afb531c.js.map