package trycatch;

import streamApi.Person;

import java.util.stream.Stream;

public class Resources {
    private Stream<Person> stream;
    private long id;

    public Resources(Stream<Person> stream, long id) {
        this.stream = stream;
        this.id = id;
    }

    public Stream<Person> getStream() {
        return stream;
    }

    public void setStream(Stream<Person> stream) {
        this.stream = stream;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
