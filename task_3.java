import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)// Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	 this.age = age;
     this.result = result; // Инициализируй поля класса в конструкторе
  }

  @Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		  // Меньше 18 - не взрослый
            { 18, true },   // 18 лет - взрослый
            { 19, true },   // Больше 18 - взрослый
            { 20, true },   // Больше 18 - взрослый
            { 21, true }  // Больше 18 - взрослый
              // Меньше 18 - не взрослый // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Для возраста " + age + " ожидается результат " + result + ", но получен " + isAdult,
            result,
            isAdult);
	}
}
