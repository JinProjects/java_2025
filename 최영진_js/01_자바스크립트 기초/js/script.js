/**
 * 문서 객체의 #title 객체를 클릭하면 함수 호출 {
 *  윈도우 객체.경고창();
 * 문서 객체의 #title 객체의 글자색에 "orange" 속성값 지정;
 * }
 *
 */

document.getElementById("title").onclick = function() {
  alert("안녕, 자바스크립트");
  document.getElementById("title").style.color = "orange";
};