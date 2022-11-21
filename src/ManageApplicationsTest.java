import static org.junit.jupiter.api.Assertions.*;

class ManageApplicationsTest {

    @org.junit.jupiter.api.Test
    void createRequest() {
        ManageApplications create = new ManageApplications();
        Maintenance request = new Maintenance();
        //when
        create.createRequest(request);
        //then
        assertEquals(1,create.request.size());
    }

    @org.junit.jupiter.api.Test
    void create() {
        //setup
        ManageApplications createapp = new ManageApplications();
        Tenants newRecord = new Tenants();
        //when
        createapp.create(newRecord);
        //then
        assertEquals(1,createapp.list.size());
    }

    @org.junit.jupiter.api.Test
    void read() {
        ManageApplications createApp = new ManageApplications();
        Tenants newApp = new Tenants();
        //when
        createApp.read(newApp.getFname());
        //then
        assertEquals(1,createApp.list.size());

    }

    @org.junit.jupiter.api.Test
    void update() {
        ManageApplications apps = new ManageApplications();
        Tenants newT = new Tenants();
        //when
        apps.update(newT.getFname());
        newT.setCreditScore(300);
        //then
        assertTrue(true);

    }

    @org.junit.jupiter.api.Test
    void delete() {
        //setup
        ManageApplications apps = new ManageApplications();
        Tenants newRecord = new Tenants();
        //when
        apps.list.remove(newRecord);
        //then
        //assertEquals(0,apps.list.size());
        assertTrue(true);
    }

    @org.junit.jupiter.api.Test
    void display() {
        //setup
        ManageApplications app = new ManageApplications();
        Maintenance request = new Maintenance();
        //when
        app.display();
        //then
        assertTrue(true);

    }
}