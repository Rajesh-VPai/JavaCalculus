/*
CC0 1.0 Universal (CC0 1.0) Public Domain Dedication

To the extent possible under law, the author(s) have dedicated all copyright
and related rights to this software to the public domain worldwide. This
software is distributed without any warranty.

You may copy, modify, distribute, and perform the work, even for commercial
purposes, all without asking permission.

For more information, see <https://creativecommons.org/publicdomain/zero/1.0/>
*/
/*
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or distribute
this software, either in source code form or as a compiled binary, for any
purpose, commercial or non-commercial, and by any means.

In jurisdictions that recognize copyright laws, the author(s) dedicate any
and all copyright interest in the software to the public domain. We make
this dedication for the benefit of the public at large and to the detriment
of our heirs and successors. We intend this dedication to be an overt act
of relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <https://unlicense.org/>
*/
/**
 *
 * @author Rajesh V Pai
 */
package Calculus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author pai_c
 */
public class ChatGPTIntegration {
    public static String chatGPT(String prompt) {
String apiUrl = "https://api.openai.com/v1/chat/completions";//"https://chatgpt.com/";//https://api.openai.com/v1/chat/completions";
String apiKey = "YOUR_API_KEY";
String model = "gpt-3.5-turbo";

try {
URL url = new URL(apiUrl);
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("POST");
connection.setRequestProperty("Authorization", "Bearer " + apiKey);
connection.setRequestProperty("Content-Type", "application/json");
connection.setDoOutput(true);

String requestBody = "{ \"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + prompt +"\"}]}";
OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
writer.write(requestBody);
writer.flush();
writer.close();

BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
StringBuilder response = new StringBuilder();
String line;
while ((line = reader.readLine()) != null) {
response.append(line);
}
reader.close();

return response.toString();
} catch (IOException e) {
throw new RuntimeException(e);
}
}
    public static void main (String... args){
        chatGPT("x^2.0"+":"+ "Differentiation"+":"+ "x");
    }
    public static String buildPrompt(String prompt, String IntegrORDiffr, String DiffWithRespTo){
        prompt=prompt + ":" + IntegrORDiffr + ":" + DiffWithRespTo;
        return prompt;
    }
}
