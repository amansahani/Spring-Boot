package com.example.demo.template;

public class Login {
    public String renderHtml = "";

    public String getRenderHtml() {
        return renderHtml;
    }

    public Login() {
        this.renderHtml = """
                <h1>Login</h1>
                <form action="/login" method="post">
                <!-- Email input -->
                <div class="form-outline mb-4">
                <input type="email" class="form-control required id="email" name="email"/>
                  <label class="form-label" for="form2Example1">Email address</label>
                </div>

                <!-- Password input -->
                <div class="form-outline mb-4">
                  <input type="password" class="form-control required id="password" name="password" />
                  <label class="form-label" for="form2Example2">Password</label>
                </div>

                </div>

                <!-- Submit button -->
                <input type="submit" class="btn btn-primary btn-block mb-4"></input>

                    """;
    }
}
