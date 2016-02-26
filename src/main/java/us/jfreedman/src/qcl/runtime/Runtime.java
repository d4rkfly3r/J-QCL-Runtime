package us.jfreedman.src.qcl.runtime;

import java.util.List;
import java.util.Stack;

/**
 * Created by Joshua Freedman on 2/26/2016.
 * Project: J-QCL-Runtime
 */
public class Runtime {

    final List<String> words;
    final Stack stack;


    public Runtime(List<String> words, Stack stack) {
        this.words = words;
        this.stack = stack;
    }

    public Runtime run(){

    }

}
