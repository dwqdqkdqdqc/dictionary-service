package ru.sitronics.tn.dictionaryservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import ru.sitronics.tn.dictionaryservice.model.base.BaseEntityLongId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "nci_users")
public class NciUser extends BaseEntityLongId {
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "organization")
    private String organization;
    @Column(name = "role")
    private String role;
    @Column(name = "personal_phone_number")
    private String personalPhoneNumber;
    @Column(name = "work_phone_number")
    private String workPhoneNumber;
    @Column(name = "mail")
    private String mail;
    @Type(type="org.hibernate.type.BinaryType")
    @Column(name = "photo")
    private byte[] photo;
    @Column(name = "ip_address")
    private String ipAdress;
    @Column(name = "event")
    private String event;
    @Column(name = "work_permission")
    private Boolean workPermission;
    @Column(name = "user_tasks")
    private String userTasks;
}
