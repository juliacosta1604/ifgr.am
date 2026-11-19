package br.edu.ifpb.ifgram.dto;

import jakarta.validation.constraints.NotNull;

public record CommentRequest() {
    public static String texto;

    @NotNull(message = "O ID do post é obrigatório")
    static Long postId;

    @NotNull(message = "O ID do autor é obrigatório")
    public static Long autorId;

    public String texto() {
        return texto ;
    }

    public Long autorId() {
        return Long.valueOf(texto);
    }
}
