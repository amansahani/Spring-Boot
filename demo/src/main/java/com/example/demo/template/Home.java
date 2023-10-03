package com.example.demo.template;

public class Home {

    public String renderHtml;

    public String getRenderHtml() {
        return renderHtml;
    }

    public Home() {
        this.renderHtml = """
                <h1>Home</h1>

                <p>Welcome Home</p>

                <button type="button" onclick="window.location.href='/'">Log out</button>
                    """;
        ;
    }

}
