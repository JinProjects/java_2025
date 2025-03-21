// tabItems : .tab-menu li 초기화
// tabContents : .section 초기화
// idx 변수(인덱스 번호) : 0
// tabContents의 첫 번째 section에게 style.display = "block"
// tabContents의 첫 번째 section에게 active 클래스 부여


const tabItems = document.querySelectorAll(".tab-menu  li");
const tabContents = document.querySelectorAll(".section");
let idx = 0;


(function(){
  tabItems[0].classList.add("active");
  tabContents[0].style.display = "block";
  tabContents[0].classList.add("active");
}());

// console.log(tabContents);
tabItems.forEach((element,i) => {
  element.addEventListener("click",() => {
    // element를 클릭하면 일단 모든 active 클래스를 제거한다.
    
    //isActiveItem : li.active 객체 초기 할당
    //isActiveContents : section.active 객체를 초기 할당

    // isActiveItem이 참이고 isActiveContents도 참이면 
    // isActiveItem에도 classList.remove()
    // isActiveContents에도 classList.remove();
    let isActiveItem = document.querySelector("li.active");
    let isActiveContents = document.querySelector("section.active");
    // console.log(isActiveItem.classList.contains("active"));

    // 클릭한 item만 active 클래스 부여
    // 클릭한 item이 가진 index번호와 일치하는 아이디를 가진 section만 active클래스를 부여
    
    
    // if(isActiveItem && isActiveContents){
      //   element.classList.add("active");
      // }
      element.classList.add("active");
      document.getElementById(`tab${i}`).classList.add("active");
      
      if(isActiveItem && isActiveContents){
        isActiveItem.classList.remove("active");
        isActiveContents.classList.remove("active");
        tabContents[i].style.display = "none"
      }
      if(!(isActiveItem && isActiveContents)){
        // isActiveItem.classList.("active");
        // isActiveContents.classList.remove("active");
        tabContents[i].style.display = "none"
      }
    // if(idx[i]){
      
    // }
    //if(!(isActiveItem && isActiveContents)){
      // isActiveItem.classList.remove();
      // isActiveContents.classList.remove();
    //}

    // tabContents.forEach((e,i) => {
    //   tabItems[i].classList.remove("active");
    //   tabContents[i].classList.remove("active");
    //   tabContents[i].classList.add("section");
    // })
    // if(!element.classList.contains("active")){
      
    //   element.classList.add("active")
    //   tabContents[i].classList.add("active");
    //   tabContents[i].style.display = "block"
    //   return;
    // }
    // if(element.classList.contains("active")){
    //   tabContents[i].style.display = "none"
    //   element.classList.remove("active");
    // }

  })  
});

// (function(){
//   tabItems[0].classList.remove("active")
//   // tabContents[0].style.display = "bolck"
//   tabContents[0].classList.remove("active")
// }());

// tabItems에 forEach() 메서드 사용 : item, index
// 각 Item에 클릭 이벤트를 준비
