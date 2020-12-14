/*
Author: Armin Irvije
Description: This interface hold the generic method that the 2 time related classes will all have
 */

package com.company;
import java.util.ArrayList;

public interface Meeting {
    void  getArray();

    ArrayList<String> secondUserChooses();

    void getSecondUserArray();
}
