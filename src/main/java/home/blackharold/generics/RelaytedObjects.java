package home.blackharold.generics;

import home.blackharold.collections.MapOfLIst;

import java.util.HashMap;
import java.util.Map;

public class RelaytedObjects {

    Object object;


    void getRelaytedObjects() {

//First try:
        if (object.getClass() == MapOfLIst.class) {
            //do something
        }
//Second try
        if(object instanceof MapOfLIst){
            //do something
        }
//Third try
        if (object.getClass().isInstance(MapOfLIst.class)) {
            //do something
        }
    }
}
