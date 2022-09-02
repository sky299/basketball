package com.jckj.util;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SequenceUtil {
    private static final long ONE_STEP = 10L;
    private static final Lock LOCK = new ReentrantLock();
    private static final Lock LOCK2 = new ReentrantLock();
    private static long lastTime = System.currentTimeMillis();
    private static short lastCount = 0;
    private static int count = 0;
    private static String index = "1";
    public static String[] chars = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public SequenceUtil() {
    }

    public static String generate12RateUuid() {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < 12; ++i) {
            int a = Math.abs((new Random()).nextInt(57));
            if (a <= 9) {
                sb.append((char)(a + 48));
            } else if (a < 33) {
                if (a + 55 != 79 && a + 55 != 73) {
                    sb.append((char)(a + 55));
                } else {
                    sb.append((char)(a + 63));
                }
            } else {
                sb.append((char)(a + 63));
            }
        }

        String RandomCipher = sb.toString();
        return RandomCipher;
    }

    public static String nextId() {
        LOCK.lock();

        try {
            if ((long)lastCount == 10L) {
                boolean done = false;

                while(!done) {
                    long now = System.currentTimeMillis();
                    if (now == lastTime) {
                        try {
                            Thread.currentThread();
                            Thread.sleep(1L);
                        } catch (InterruptedException var7) {
                        }
                    } else {
                        lastTime = now;
                        lastCount = 0;
                        done = true;
                    }
                }
            }

            short var10000 = lastCount;
            lastCount = (short)(var10000 + 1);
            count = var10000;
        } finally {
            LOCK.unlock();
            return lastTime + "" + String.format("%03d", count) + index;
        }
    }

    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");

        for(int i = 0; i < 7; ++i) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 62]);
        }

        return shortBuffer.toString();
    }

    public static void main(String[] args) {
    }
}
