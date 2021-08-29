package com.javarush.task;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(engine.eval(foo));
    }
}
