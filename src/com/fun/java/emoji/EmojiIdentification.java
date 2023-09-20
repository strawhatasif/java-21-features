package com.fun.java.emoji;

public class EmojiIdentification {
    public static void main(String[] args) {
        var codePoint = Character.codePointAt("\uD83E\uDD23", 0);
        var isEmoji = Character.isEmoji(codePoint);

        //this should print "true" as it detects the value is an emoji
        System.out.println("Is this an emoji? " + isEmoji);
    }
}
