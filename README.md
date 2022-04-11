## JAVA POS PROGRAM

# 프로젝트 설명
JAVA AWT/SWING , DB를 이용한 포스POS 프로그램입니다.

# 프로젝트 기능
  + 로그인(ID,PWD찾기)
  + 판매창에서 제품 선택 후 결제
  + 관리창에서 제품 재고수량 확인 & 보충
  + 관리창에서 제품 판매현황 확인

# 프로그램 기능
1. DAO
  + BakeryDAO.java<br/>
     - Data access object 파일
     
2. VO 
  + BakeryVo.java<br/>
     - Value object 파일(이하생략)
     - 판매 현황 객체 파일 
  + InvenVo.java<br/>
     - 재고 관리 객체 파일
  + LoginVo.java<br/>
     - 로그인 관리 객체 파일
  + IdsearchVo.java<br/>
     - 아이디 찾기 객체 파일
  + PwdsearchVo.java<br/>
     - 비밀번호 찾기 객체 파일
     
3. GUI
  + CountListUI.java <br/>
     - 제품별 판매현황 UI
  + IdsearchUI.java <br/>
     - ID찾기 UI
  + InvenUIUP.java <br/>
     - 재고관리 UI
  + LoginUI.java <br/>
     - 로그인창 UI
  + MainUI.java <br/>
     - 판매창 UI
  + PwdsearchUI.java <br/>
     - PWD찾기 UI
  + SellListUI.java <br/>
     - 총 판매현황 UI
  + SettingUI.java <br/>
     - 관리 메뉴창 UI
  + StartUI.java <br/>
     - 판매 / 관리 / 로그아웃 선택창 UI
