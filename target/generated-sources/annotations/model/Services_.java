package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Requisitions;
import model.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-11T13:02:17")
@StaticMetamodel(Services.class)
public class Services_ { 

    public static volatile SingularAttribute<Services, Users> idUser;
    public static volatile SingularAttribute<Services, String> name;
    public static volatile SingularAttribute<Services, Integer> id;
    public static volatile CollectionAttribute<Services, Requisitions> requisitionsCollection;

}