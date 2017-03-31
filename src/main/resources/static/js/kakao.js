/**
 * Created by Minwoo on 2017. 3. 29..
 */


Kakao.init('d32b44e7f16d211afcab733f0a367dda');
// 카카오 로그인 버튼을 생성합니다.

//

function getStatus() {
    Kakao.Auth.getStatus(function(statusObj) {
        var kakao = statusObj['status']
    });
}
function loginWithKakao() {
    // 로그인 창을 띄웁니다.
    Kakao.Auth.login({
        success: function(authObj) {
            $.ajax({
                type: "POST",
                url: "http://127.0.0.1:8080/kakao",
                data:  JSON.stringify(authObj),
                dataType: "json",
                contentType : "application/json; charset=UTF-8",
                success: function(data, textStatus) {

                    if (data.redirect) {
                        // data.redirect contains the string URL to redirect to
                    }
                    else {
                        // data.form contains the HTML for the replacement form
                        $("#myform").replaceWith(data.form);
                    }
                }
            });

            window.location.href = "/index";
        },
        fail: function(err) {
            alert(JSON.stringify(err));
        }
    });
};
