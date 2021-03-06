package cucumber.stepdefenitions;

import com.github.e999or.lesson28.CarBrendPage;
import com.github.e999or.lesson28.FactoryAvtoPage;
import com.github.e999or.lesson28.MainPage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class BspStep {

    MainPage mainPage = new MainPage();
    FactoryAvtoPage factoryAvtoPage =new FactoryAvtoPage();
    CarBrendPage carBrendPage = new CarBrendPage();

    @Дано("пользователь вводит в адресную строку браузера название сайта.")
    public void open() {
        mainPage.openAvtoMP();
    }

    @Когда("переход осуществлен, проверяем название страницы {string}.")
    public void checkNamePage(String title) {
        mainPage.chekTitleMP(title);
    }

    @Тогда("Сохранить количество объявлений, отображаемых перед названием {string}.")
    public void countPost(String factory) {
        mainPage.getCountPost(factory);
    }

    @Тогда("Перейти на страницу с объявлениям производителя автомобилей из п2.")
    public void clickFactoryAvtoPage() {
        mainPage.clickFactoryAP();
    }

    @Когда("Переход осуществлен. Отображается кнопка с текстом, содержащим количество объявлений из п2.")
    public void checkButtonContent() {
        factoryAvtoPage.checkButtonFactoryAP();
    }

    @Тогда("Сохранить количество объявлений {string}")
    public void checkPost(String carBrend) {
        factoryAvtoPage.checkPostFactoryAP(carBrend);
    }

    @Когда("Перейти на страницу марки из п4")
    public void openPageCarBrend() {
        factoryAvtoPage.openPageCB();
    }

    @Тогда("Переход осуществлен. Отображается кнопка с текстом, содержащим количество объявлений модели из п4.")
    public void checkButtonCarBrendPage() {
        carBrendPage.checkButtonCarBP();
    }
}