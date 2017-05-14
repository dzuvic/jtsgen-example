package dz.jtsgen.example.server.resource;


import dz.jtsgen.example.Person;
import dz.jtsgen.example.Sex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Path("/person")
public class PersonRessource {

    private static final Logger LOG = LoggerFactory.getLogger(PersonRessource.class);

    private final List<Person> persons = Stream.of(
        new Person("Immanuel Kant", LocalDate.of(1724,4,22), Sex.M)
    ).collect(Collectors.toList());


    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPersons() {
        LOG.info("list persons called:");
        return Response.accepted().entity(persons).build();
    }
    
}