package com.fun.java.emoji;

public class EmojiIdentification {
    public static void main(String[] args) {
        var emoji = "\uD83E\uDD23";
        var notEmoji = "ↂ";

        //the symbol assigned to the notEmoji variable is not an emoji
        System.out.println("Is this an emoji? " + isEmoji(emoji));
        System.out.println("Is this symbol an emoji? " + isEmoji(notEmoji));

    }

    protected static boolean isEmoji (String symbol) {
     return Character.isEmoji(Character.codePointAt(symbol, 0));
    }
}
