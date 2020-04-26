// $(function () {
//       createMyPage(1,5);
//      // deleteMyPage();
//
// })
window.onload = showDetail("Tarjan",52518,52819);

function showDetail(subject,stu1,stu2){
    var url = "/API/TF/getDetail";
    var subject = subject;
    var stu1 = stu1;
    console.log(stu1);
    var stu2 = stu2;
    $.ajax({
        url: url,
        type: "POST",
        data: JSON.stringify({
            subject: subject,
            stu1:stu1,
            stu2:stu2
        }),
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        success: function (result) {
            var jsondata = JSON.stringify(result);
            console.log(result);
            var jsonobj = eval("("+jsondata+")");
            var topThreeSim = jsonobj.topThreeSim;
            $("#slider-range-min").slider({
                range: "min",
                value: 0.8,
                min: 0.1,
                max: 1.0,
                step: 0.1,
                slide: function (event, ui) {
                    $("#amount").val(ui.value);
                }
            });
            $("#amount").val($("#slider-range-min").slider("value"));

            var option1 = {
                value: topThreeSim[0],//百分比,必填
                // name: 'TF Similarity',//必填
                name: '片段相似度',//必填
                // title: 'Top Similarity ',
                title: '相似度前三',

                backgroundColor: '#f0fff4',
                color: ['#38a8da', '#d4effa'],
                fontSize: 20,
                domEle: document.getElementById("chart1")//必填
            }
            percentPie1 = new PercentPie(option1);
            percentPie1.init();

            var option2 = {
                value: topThreeSim[1],//百分比,必填
                // name: 'TF Similarity',//必填
                name: '片段相似度',//必填
                // title:'相似度第一',
                backgroundColor: '#f0fff4',
                color: ['#38a8da', '#d4effa'],
                fontSize: 20,
                domEle: document.getElementById("chart2")//必填
            }
            percentPie2 = new PercentPie(option2);
            percentPie2.init();

            var option3 = {
                value: topThreeSim[2],//百分比,必填
                // name: 'TF Similarity',//必填
                name: '片段相似度',//必填
                // title:'相似度第一',
                backgroundColor: '#f0fff4',
                color: ['#38a8da', '#d4effa'],
                fontSize: 20,
                domEle: document.getElementById("chart3")//必填
            }
            percentPie3 = new PercentPie(option3);
            percentPie3.init();

            var tfList1 = jsonobj.tf1;
            // console.log(tfList1);
            var content = tfList1[0];
            for(i=0;i<content.length;i++){
                var item = content.charAt(i);
                if(item == '<'){
                    console.log("dfa");
                    content.replace(/</,"&lt;");
                    //可以直接替代，不用判断，但不知为啥没能替代
                }
                if(item == '>'){
                    content.replace(/>/,"&gt;");
                }
            }
            console.log(content);
            var frag1 = $("#frag1");
            var content1 = $("<h3>学生 No."+stu1+"</h3>\n" +
                "                <div class=\"frag-code\">\n" +
                "                <pre>\n" +
                content +
                "</pre>\n" +
                "                </div>")
            frag1.append(content1);
            var tfList2 = jsonobj.tf2;
            var frag2 = $("#frag2");
            var content2 = $("<h3>学生 No."+stu2+"</h3>\n" +
                "                <div class=\"frag-code\">\n" +
                "                <pre>\n" +
                tfList2[0] +
                "</pre>\n" +
                "                </div>")
            frag2.append(content2);
        }
    })
}

function createMyPage(start,end) {
    var i = start;
    var myPage = $("#myPage");
    var li_left = $("<li class='page-li'><a onclick='pre()'>&laquo;</a></li>\n");
    myPage.append(li_left);
    for(i; i <= end; i++){
        var l = $("<li class='page-li'><a onclick='testA("+i+")'>"+i+"</a></li>");
        myPage.append(l);
    }
    var li_right = $("<li class='page-li'><a onclick='next()'>&raquo;</a></li>");
    myPage.append(li_right);
}

function deleteMyPage() {
    var list = $(".page-li");
    // console.log(list.length);
    var i = 0;
    for(i; i<list.length;i++){
        list[i].remove();
    }
}

function testA(index) {
    // console.log(data)
    sessionStorage.setItem("current",index);
    if(index===5||(index>5 && index%4===1)){
        deleteMyPage();
        createMyPage(index,index+4);
    }
}

function pre(){
    var current = sessionStorage.getItem("current");
    console.log(current);
    testA(current-1);
}

function next(){
    var current = sessionStorage.getItem("current");
    console.log(current);
    testA(current+1);
}

function display(index){

}