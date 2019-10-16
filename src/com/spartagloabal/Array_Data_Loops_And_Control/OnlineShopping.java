package com.spartagloabal.Array_Data_Loops_And_Control;

public class OnlineShopping {
    private String[] shoppingBasicArr = {"Milk", "Egg", "rice", "Pork", "Ramen"};
    private String[] shoppingNiceToHaveArr = {"Chesse", "Shrimp", "Steak", "Truffle", "Lobster"};



    public String[] newBasicArr(String[] removeItem){
        int iCount = 0;
        String[] updateBasicArr = new String[shoppingBasicArr.length - removeItem.length];

        for(int i = 0; i < removeItem.length; i++){
            System.out.println(removeItem[i]);
            for(int j = 0; j < shoppingBasicArr.length; j++){
                System.out.println(shoppingBasicArr[j]);
//                if (shoppingBasicArr[i] != removeItem[j]){
//                    updateBasicArr[iCount] = shoppingBasicArr[i];
//                    iCount++;
                }

            }
        }
        return updateBasicArr;
    }
//    public void printBasics()
//    {
//        for (String shoppingItem: shoppingBasicArr){
//            System.out.println(shoppingItem);
//        }
//    }
//    public void printNiceToHave(){
//        for (String shoppingNiceToHave : shoppingNiceToHaveArr){
//            System.out.println(shoppingNiceToHave);
//        }
//    }
}
