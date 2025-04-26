package org.springframework.beans.factory.stereotype;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

 /*По умолчанию аннотации не загружаются в память во время работы программы (RetentionPolicy.CLASS)
Мы изменили данное поведение через новую политику удержания (RetentionPolicy.RUNTIME)*/
 @Retention(RetentionPolicy.RUNTIME)
public @interface Component {
}
