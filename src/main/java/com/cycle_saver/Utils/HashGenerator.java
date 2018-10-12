package com.cycle_saver.Utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.time.Instant;

public class HashGenerator {

    public String generateUniqueHash(){
        Instant instant = Instant.now();
        long timeStampMillis = instant.toEpochMilli();
        return DigestUtils
                .md5Hex(Long.toString(timeStampMillis)).toUpperCase();
    }
}
