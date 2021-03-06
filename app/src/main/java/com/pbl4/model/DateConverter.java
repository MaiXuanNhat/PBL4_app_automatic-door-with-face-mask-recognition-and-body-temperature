package com.pbl4.model;
import androidx.room.ProvidedTypeConverter;
import androidx.room.TypeConverter;
import java.util.Date;
@ProvidedTypeConverter
public class DateConverter {
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
