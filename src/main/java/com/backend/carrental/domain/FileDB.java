package com.backend.carrental.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "files")
public class FileDB {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id; // automatically generated as UUID

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long idx;

    @Size(max = 30)
    @Column(length = 30)
    private String model;

    private String name; // name of the file

    private String type; // mime type

    @JsonIgnore
    @Lob // datatype for storing large object data
    private byte[] data; // array of bytes, map to a BLOB (BLOB is for storing binary data)

    public FileDB(String model, String name, String type, byte[] data) {
        this.model = model;
        this.name = name;
        this.type = type;
        this.data = data;
    }
}
