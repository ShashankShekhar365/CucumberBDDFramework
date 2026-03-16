package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import driverfactory.DriverFactory;

public class Hooks {

@Before
public void setup() {

DriverFactory.initDriver();

}

@After
public void tearDown() {

DriverFactory.getDriver().quit();

}

}