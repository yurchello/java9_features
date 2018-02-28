
module app {
    requires java.xml;
    requires modulesDemoENImpl;
    requires modulesDemoRUImpl;
    requires modulesDemo;
    uses com.yurchello.moduleTest.ServiceModule;
}