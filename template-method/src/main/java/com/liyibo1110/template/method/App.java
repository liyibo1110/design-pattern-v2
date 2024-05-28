package com.liyibo1110.template.method;

/**
 * @author liyibo
 * @date 2024-05-28 17:15
 */
public class App {

    public static void main(String[] args) {
        var thief = new HalflingThief((new HitAndRunMethod()));
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
