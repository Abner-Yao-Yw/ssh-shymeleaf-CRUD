$(function () {
   $('#btn').on('click',function () {
       var url="/springmvc/student/add"
       var args=$('#form').serialize()
       $.post(url,args,function (data) {
           alert(data)
       })
   })
})