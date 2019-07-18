package sda.jpa.model;

public class NoteDTO {

    public Integer noteValue;
    public String profesorName;


    public NoteDTO(Integer noteValue, String profesorName) {
        this.noteValue = noteValue;
        this.profesorName = profesorName;
    }


}
