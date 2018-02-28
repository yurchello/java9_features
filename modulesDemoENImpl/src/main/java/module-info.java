module modulesDemoENImpl {
    requires modulesDemo;
    exports com.yurchello.impl.en;
    provides com.yurchello.moduleTest.ServiceModule with com.yurchello.impl.en.ServiceENImpl;
}