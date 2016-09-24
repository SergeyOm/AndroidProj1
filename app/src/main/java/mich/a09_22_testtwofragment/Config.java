package mich.a09_22_testtwofragment;

import java.util.ArrayList;

import mich.a09_22_testtwofragment.model.Store;
import mich.a09_22_testtwofragment.model.StoreTest;
import mich.a09_22_testtwofragment.model.Tools;

/**
 * Created by michigan on 09/22/2016.
 */
public class Config {

    private static final String[] NAMESTORE = {
            "Store 1","Store 2","Store 1","Store 3",
            "Store 4","Store 5","Store 6"};
    private static final String[] PHONESTORE = {
            "0563335501","0563335502","0563335501","0563335503",
            "0563335504","0563335505","0563335506"};
    private static final String[] MAiLSTORE = {
            "Store1@i.ua","Store2@i.ua","Store1@i.ua","Store3@i.ua",
            "Store4@i.ua","Store5@i.ua","Store6@i.ua"};

    public static ArrayList getStoreData() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < NAMESTORE.length; i++) {
            arrayList.add(new StoreTest()
                    .setName(NAMESTORE[i])
                    .setAddress(MAiLSTORE[i])
                    .setPhone(PHONESTORE[i]) );
            }
        return arrayList;
    }

    //-------------------------------------------------------

}

