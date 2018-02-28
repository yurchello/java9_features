module modulesDemoRUImpl {
    requires modulesDemo;
    exports com.yurchello.impl.ru;
    provides com.yurchello.moduleTest.ServiceModule with com.yurchello.impl.ru.ServiceRUImpl;
}