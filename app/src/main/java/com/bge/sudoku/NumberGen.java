package com.bge.sudoku;

import android.content.Context;

import java.util.Random;

class NumberGen {

    private Context c;
    private int randomNbr;
    private int randomNbrGrid;

    public void gener(Context c, String[] sudoGrid) {

        for(int i = 0; i < 9; i++){

            sudoGrid[0] = "" + c;
            randomNbrGrid = new Random().nextInt(((15) + 1));
            randomNbr = new Random().nextInt(((4 - 1) + 1)+1);
            String randomNbr2 = "" + randomNbr;
            boolean testL = testLigne(sudoGrid, randomNbr2);

            if(sudoGrid[randomNbrGrid].compareTo("") == 0 && testL) {
                sudoGrid[randomNbrGrid] = "" + randomNbr2;
            } else {
                i--;
            }

        }

    }

    public boolean testLigne(String[] chiffre, String rdnNbr){

        float modI;
        int longueur = 0;
        String[] testDoublon = new String[4];
        int z = 0;

        for ( int i = 0; i < chiffre.length; i++ ){
            modI = i/4;
            if( modI <= 1 ) {
                if ( rdnNbr.compareTo(chiffre[i]) == 0 ) {
                    return false;
                }
                if (chiffre[i].compareTo("") != 0 ) {
                    testDoublon[z] = chiffre[i];
                    z++;/*
                    for (String aTestDoublon : testDoublon) {
                        if (aTestDoublon.compareTo(chiffre[i]) == 0) {
                            return false;
                        }

                    }*/

                }

            }/*
            if (modI > 1 && modI <= 2) {
                if (rdnNbr.compareTo(chiffre[i]) == 0){
                    return false;
                }
            }
            if (modI > 2 && modI <= 3) {
                if (chiffre[i].compareTo(rdnNbr) == 0){
                    return false;
                }
            }
            if (modI > 3 && modI <= 4) {
                if (chiffre[i].compareTo(rdnNbr) == 0){
                    return false;
                }
            }*/
        }
        return true;
    }


}
